package org.http4k.openapi.v2

import org.http4k.openapi.ApiGeneratorContract

class ClientApiGeneratorTest : ApiGeneratorContract<OpenApi2Spec>(OpenApi2Spec::class, ClientApiGenerator)
