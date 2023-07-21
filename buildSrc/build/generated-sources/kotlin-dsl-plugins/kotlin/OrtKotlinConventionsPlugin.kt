/**
 * Precompiled [ort-kotlin-conventions.gradle.kts][Ort_kotlin_conventions_gradle] script plugin.
 *
 * @see Ort_kotlin_conventions_gradle
 */
public
class OrtKotlinConventionsPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Ort_kotlin_conventions_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
