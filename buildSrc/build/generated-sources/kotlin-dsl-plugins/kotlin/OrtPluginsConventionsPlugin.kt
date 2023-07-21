/**
 * Precompiled [ort-plugins-conventions.gradle.kts][Ort_plugins_conventions_gradle] script plugin.
 *
 * @see Ort_plugins_conventions_gradle
 */
public
class OrtPluginsConventionsPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Ort_plugins_conventions_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
