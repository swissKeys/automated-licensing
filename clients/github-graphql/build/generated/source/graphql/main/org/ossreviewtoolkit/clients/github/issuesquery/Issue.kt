package org.ossreviewtoolkit.clients.github.issuesquery

import com.expediagroup.graphql.client.Generated
import kotlin.Boolean
import kotlin.String
import kotlinx.serialization.Serializable
import org.ossreviewtoolkit.clients.github.DateTime
import org.ossreviewtoolkit.clients.github.URI

/**
 * An Issue is a place to discuss ideas, enhancements, tasks, and bugs for a project.
 */
@Generated
@Serializable
public data class Issue(
  /**
   * Identifies the issue title.
   */
  public val title: String,
  /**
   * The HTTP URL for this issue
   */
  public val url: URI,
  /**
   * Identifies the body of the issue rendered to text.
   */
  public val bodyText: String,
  /**
   * `true` if the object is closed (definition of closed may depend on type)
   */
  public val closed: Boolean,
  /**
   * Identifies the date and time when the object was closed.
   */
  public val closedAt: DateTime? = null,
  /**
   * Identifies the date and time when the object was created.
   */
  public val createdAt: DateTime,
  /**
   * The moment the editor made the last edit
   */
  public val lastEditedAt: DateTime? = null,
  /**
   * A list of labels associated with the object.
   */
  public val labels: LabelConnection? = null,
)
