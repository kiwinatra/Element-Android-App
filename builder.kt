import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.command.WriteCommandAction
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFileFactory
import com.intellij.psi.PsiJavaFile
import org.jetbrains.kotlin.idea.j2k.J2kConverterExtension

// поскольку мне лень переписывать mainactivity я просто буду конвертить в buildain

fun convertJavaToKotlin(project: Project, javaFile: File) {
    ApplicationManager.getApplication().invokeLater {
        WriteCommandAction.runWriteCommandAction(project) {
            val psiFile = PsiFileFactory.getInstance(project)
                .createFileFromText(javaFile.name, javaFile.readText()) as PsiJavaFile
            
            val converter = J2kConverterExtension.extension()
            val kotlinFile = converter.convertFile(psiFile, project)
            
            val outputFile = File(
                javaFile.parentFile.path.replace("element", "element_kt"),
                javaFile.nameWithoutExtension + ".kt"
            )
            
            outputFile.writeText(kotlinFile?.text ?: "сука")
        }
    }
}