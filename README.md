# wapp-clj
 

## Prerequisites

You will need [Leiningen][] 2.0.0 or above installed.

[leiningen]: https://github.com/technomancy/leiningen

## Running

To start a web server for the application, run:

    lein ring server

## License

Copyright © 2023 Binay Mishra <binaymishramca@gmail.com>

## Build uberjar

~~~
lein ring uberjar
~~~

## Run locally

~~~
sh run-local.sh
~~~

## Web Browser

[Home http://localhost:3000/ ](http://localhost:3000/)

[GET  http://localhost:3000/api](http://localhost:3000/api)

[POST http://localhost:3000/api](http://localhost:3000/api)

JSON Body for Postman
~~~
{
    "message": "Hello Clojure"
}
~~~

Or cURL command

~~~
curl -X POST 'http://localhost:3000/api' -H 'Content-Type: application/json' --data-raw '{"message": "Hello Clojure"}'
~~~

## TO-DO

Develope APIs with database integration


