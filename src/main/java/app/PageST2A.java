package app;

import java.util.ArrayList;

import io.javalin.http.Context;
import io.javalin.http.Handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Example Index HTML class using Javalin
 * <p>
 * Generate a static HTML page using Javalin
 * by writing the raw HTML into a Java String object
 *
 * @author Timothy Wiley, 2023. email: timothy.wiley@rmit.edu.au
 * @author Santha Sumanasekara, 2021. email: santha.sumanasekara@rmit.edu.au
 */
public class PageST2A implements Handler {

    // URL of this page relative to http://localhost:7001/
    public static final String URL = "/page2A.html";

    @Override
    public void handle(Context context) throws Exception {
        // Create a simple HTML webpage in a String
        String html = """
            <html>
                <head>
                    <title>Subtask 2.1</title>
                    <link rel='stylesheet' type='text/css' href='common.css' />
                </head>
                <body>
                    <div class='topnav'>
                        <a href='/'>Homepage</a>
                        <a href='mission.html'>Our Mission</a>
                        <a href='page2A.html'>Sub Task 2.A</a>
                        <a href='page2B.html'>Sub Task 2.B</a>
                        <a href='page3A.html'>Sub Task 3.A</a>
                        <a href='page3B.html'>Sub Task 3.B</a>
                    </div>
                    <div class='header'>
                        <h1>Subtask 2.A</h1>
                    </div>
                    <div class='content'>
                        <p>Subtask 2.A page content</p>
                    </div>
                    <div class='footer'>
                        <p>COSC3056 - Studio Project Starter Code</p>
                    </div>
                </body>
            </html>
        """;

        // DO NOT MODIFY THIS
        // Makes Javalin render the webpage
        context.html(html);
    }

}
