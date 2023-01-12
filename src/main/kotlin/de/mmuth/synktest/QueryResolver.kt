package de.mmuth.synktest

import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class QueryResolver : GraphQLQueryResolver {

    fun test() = "Hello GraphQL"

}