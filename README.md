Api gateway request -> Abstract Request -> T -> R -> Abstract response -> api gateay response

Network layer
Service layer
Data layer

Handler
- Input:  f<T, R>  (should f take an abstract context?)
- implements AGRequest -> T
- implements R -> AGResponse
- references in services.yml
- possible convention: handlers in provider packages; services.yml substitutes $provider.name

Are multiple artifacts possible with serverless?





network
- handler
- - primitive (accepts string, int; likely internal lambdas, e.g. cron job)
- - http
- - - aws (api gateway request/response)
      azure
      google
- messaging (defines events / messages that can be made)
- - aws
- - - sqs

service (high level suspend functions of business logic; handles dispatch; in/out are types in data package)
- sync  (backs synchronous lambda functions)
- async (2-lambda callbacks)

storage (highest level = suspend functions to get/set)
- object
- - aws
- - - s3
- cache
- - aws
- - - redis
- keyval.aws.dynamodb
- relational.aws.aurora


data (schema)


supporting projects:
inf-network (vpc, routing, ACLs, security groups, DNS)
inf-permissions (iam policies and roles)
inf-secrets (key management)
inf-data (s3, databases)
