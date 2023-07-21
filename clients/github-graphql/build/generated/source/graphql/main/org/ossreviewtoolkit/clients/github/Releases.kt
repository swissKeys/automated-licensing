package org.ossreviewtoolkit.clients.github

import com.expediagroup.graphql.client.Generated
import com.expediagroup.graphql.client.types.GraphQLClientRequest
import kotlin.Int
import kotlin.String
import kotlin.reflect.KClass
import kotlinx.serialization.Required
import kotlinx.serialization.Serializable
import org.ossreviewtoolkit.clients.github.releasesquery.Repository

public const val RELEASES_QUERY: String =
    "query ReleasesQuery(${'$'}repo_owner: String!, ${'$'}repo_name: String!, ${'$'}page_size: Int!, ${'$'}cursor: String) {\n    repository(owner: ${'$'}repo_owner, name: ${'$'}repo_name) {\n        releases(first: ${'$'}page_size, after: ${'$'}cursor, orderBy: {field: CREATED_AT, direction: ASC}) {\n            edges {\n                node {\n                    url\n                    name\n                    publishedAt\n                    tagName\n                    tagCommit {\n                        commitUrl\n                    }\n                }\n            }\n            pageInfo {\n                endCursor\n                hasNextPage\n            }\n        }\n    }\n}"

@Generated
@Serializable
public class ReleasesQuery(
  public override val variables: ReleasesQuery.Variables,
) : GraphQLClientRequest<ReleasesQuery.Result> {
  @Required
  public override val query: String = RELEASES_QUERY

  @Required
  public override val operationName: String = "ReleasesQuery"

  public override fun responseType(): KClass<ReleasesQuery.Result> = ReleasesQuery.Result::class

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
