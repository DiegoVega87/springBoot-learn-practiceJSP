<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

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

 <%@ include file="common/footer.jspf" %>
 <script type="text/javascript">
          $('#targetDate').datepicker({
              format: 'yyyy-mm-dd',
              startDate: '-3d'
          });
         </script>