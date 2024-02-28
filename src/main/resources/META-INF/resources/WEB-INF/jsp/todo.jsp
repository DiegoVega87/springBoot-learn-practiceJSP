<%@ taglib prefix="c" uri="jakarta.tags.core" %> <!-- Used for SpringBoot 3.2.X and above -->

<!-- uri="http://www.springframework.org/tags/form" is used to bind the form data to the model class -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
    <head>

        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
        <link href="webjars\bootstrap-datepicker\1.9.0\css\bootstrap-datepicker.standalone.min.css" rel="stylesheet">
        <title> Todos page!</title>

    </head>
    <body>
        <nav class="navbar navbar-expand-md navbar-light bg-light mb-3 p-1">
            <a class="navbar-brand m-1" href="https://courses.in28minutes.com">in28minutes</a>
            <div class="collapse navbar-collapse">
                <ul class="navbar-nav">
                    <li class="nav-item"><a class="nav-link" href="/">Home</a></li>
                    <li class="nav-item"><a class="nav-link" href="/list-todos">Todos</a></li>
                </ul>
            </div>
            <ul class="navbar-nav">
                <li class="nav-item"><a class="nav-link" href="/logout">Logout</a></li>
            </ul>
        </nav>

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
         <script src="webjars\bootstrap-datepicker\1.9.0\js\bootstrap-datepicker.min.js"></script>

         <script type="text/javascript">
         $('#targetDate').datepicker({
             format: 'yyyy-mm-dd',
             startDate: '-3d'
         });
        </script>

    </body>
</html>