<%@ taglib prefix="c" uri="jakarta.tags.core" %> <!-- Used for SpringBoot 3.2.X and above -->

<!-- uri="http://www.springframework.org/tags/form" is used to bind the form data to the model class -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
    <head>

        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
        <title> Todos page!</title>

    </head>
    <body>
        <div class="container">

            <h1>Enter Todo Details</h1>
            <!-- modelAttribute="todo" is used to bind the form data to the model class -->
            <form:form method="post" modelAttribute="todo">
                Description: <form:input type="text" path="description" required="required"/>
                <form:errors path="description" cssClass="text-warning"/> <!-- Used to display the error message after Binding the result-->
                <form:input type="hidden" path="id"/>
                <form:input type="hidden" path="done"/>
                <input type="submit" class="btn btn-success"/>
            </form:form>
        </div>
         <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
         <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    </body>
</html>