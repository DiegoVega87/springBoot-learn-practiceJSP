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

                <fieldset class="mb-3"> <!-- Used to group the form elements.  class mb-3 adds a margin at the bottom -->
                    <form:label path="Description">Description</form:label> <!-- Used to display the label -->
                    <form:input type="text" path="description" required="required"/>
                    <form:errors path="description" cssClass="text-warning"/> <!-- Used to display the error message after Binding the result-->
                </fieldset>

                <fieldset class="mb-3"> <!-- Used to group the form elements.  class mb-3 adds a margin at the bottom -->
                    <form:label path="targetDate">Target Date</form:label> <!-- Used to display the label -->
                    <form:input type="text" path="targetDate" required="required"/>
                    <form:errors path="targetDate" cssClass="text-warning"/> <!-- Used to display the error message after Binding the result-->
                </fieldset>

                <form:input type="hidden" path="id"/>

                <form:input type="hidden" path="done"/>

                <input type="submit" class="btn btn-success"/>
            </form:form>
        </div>
         <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
         <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    </body>
</html>