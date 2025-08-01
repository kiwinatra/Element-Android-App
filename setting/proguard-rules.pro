# Основные правила для компила
-keep class kotlin.Metadata { *; }
-keepclassmembers class **$WhenMappings { <fields>; }

# сохраняем активы а то не запустится
-keep public class * extends android.app.Activity

# сохр viewbuid
-keep class * extends android.view.View { *; }