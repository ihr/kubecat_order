package org.ingini.kubecat;

import io.vertx.core.Vertx;

public class OrderMain {

    public static void main(String[] args) {
        // Create an HTTP server which simply returns "Hello World!" to each request.
        Vertx.vertx().createHttpServer().requestHandler(req -> req.response().end("Order is being created!")).listen(8080);
    }

}
