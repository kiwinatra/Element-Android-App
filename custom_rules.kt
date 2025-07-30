import io.gitlab.arturbosch.detekt.api.*

class NoHardcodedStrings : Rule() {
    override val issue = Issue(
        "NoHardcodedStrings",
        Severity.Warning,
        "Avoid hardcoding strings",
        Debt.TWENTY_MINS
    )

    override fun visitStringTemplateExpression(expr: KtStringTemplateExpression) {
        if (expr.text.contains("\"") && !expr.isAnnotationString()) {
            report(CodeSmell(issue, expr, "Move string to resources"))
        }
    }
}