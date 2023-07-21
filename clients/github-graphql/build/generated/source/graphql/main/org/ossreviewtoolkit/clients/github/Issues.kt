package org.ossreviewtoolkit.clients.github

import com.expediagroup.graphql.client.Generated
import com.expediagroup.graphql.client.types.GraphQLClientRequest
import kotlin.Int
import kotlin.String
import kotlin.reflect.KClass
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable
import org.ossreviewtoolkit.clients.github.issuesquery.Repository

public const val ISSUES_QUERY: String =
    "query IssuesQuery(${'$'}repo_owner: String!, ${'$'}repo_name: String!, ${'$'}page_size: Int!, ${'$'}cursor: String) {\n    repository(owner: ${'$'}repo_owner, name: ${'$'}repo_name) {\n        issues(first: ${'$'}page_size, after: ${'$'}cursor, orderBy: { field: CREATED_AT, direction: DESC }) {\n            edges {\n                node {\n                    title\n                    url\n                    bodyText\n                    closed\n                    closedAt\n                    createdAt\n                    lastEditedAt\n                    labels(first: 100) {\n                        edges {\n                            node {\n                                name\n                            }\n                        }\n                    }\n                }\n            }\n            pageInfo {\n                endCursor\n                hasNextPage\n            }\n        }\n    }\n}"

@Generated
@Serializable
public class IssuesQuery(
  public override val variables: IssuesQuery.Variables,
) : GraphQLClientRequest<IssuesQuery.Result> {
  @Required
  public override val query: String = ISSUES_QUERY

  @Required
  public override val operationName: String = "IssuesQuery"

  public override fun responseType(): KClass<IssuesQuery.Result> = IssuesQuery.Result::class

  @Generated
  @Serializable
  public data class Variables(
    public val repo_owner: String,
    public val repo_name: String,
    public val page_size: Int,
    public val cursor: String? = null,
  )

  /**
   * The query root of GitHub's GraphQL interface.
   */
  @Generated
  @Serializable
  public data class Result(
    /**
     * Lookup a given repository by the owner and repository name.
     */
    public val repository: Repository? = null,
  )
}
