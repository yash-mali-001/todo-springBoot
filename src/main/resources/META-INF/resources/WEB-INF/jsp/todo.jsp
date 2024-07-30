<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="container">
    <h1>ADD TODO</h1>
    <form:form method="POST" modelAttribute="todo">
        <fieldset class="mb-3">
            <form:label path="description">Description</form:label>
            <form:input path="description" type="text" required="required" name="description"/>
            <form:errors path="description" cssClass="text-warning"/>
        </fieldset>

        <fieldset class="mb-3">
            <form:label path="targetDate">Target Date</form:label>
            <form:input path="targetDate" type="date" required="required" name="targetDate"/>
            <form:errors path="targetDate" cssClass="text-warning"/>
        </fieldset>
        <form:input type="hidden" path="id"/>
        <form:input type="hidden" path="done"/>
        <input type="submit" class="btn btn-success"/>
    </form:form>
    </div>
<%@ include file="common/footerr.jspf" %>
<script type="text/javascript">
    $('#targetDate').datepicker({
       format: 'yyyy-mm-dd',
});


