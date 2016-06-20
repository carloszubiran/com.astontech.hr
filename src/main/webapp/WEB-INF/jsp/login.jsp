<%@ include file="./includes/header.jsp" %>

<div class="container blueBackground">

    <div class="col-sm-6">
        <img src="${pageContext.servletContext.contextPath}/static/images/header-logo.png" alt="">
    </div>
    <br />
    <div class="col-sm-4">
        <form id="form" action="<c:url value='/login.do' />" method="post">

            <c:if test="${not empty param.err}">
                <div class="msg-container text-white error">
                    <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}"></c:out>
                </div>
            </c:if>
            <c:if test="${not empty param.out}">
                <div class="msg-container text-white logout">
                    You've been logged out successfully.
                </div>
            </c:if>
            <c:if test="${not empty param.time}">
                <div class="msg-container text-white error">
                    You've been logged out due to inactivity.
                </div>
            </c:if>

            <span class="text-white">Username:</span>
            <input type="text" name="username" value="" />
            <br><br>
            <span class="text-white">Password:</span>
            <input type="password" name="password"value="" />

            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">

            <br>
            <br>

            <input value="Login" name="submit" type="submit" class="btn btn-default">

        </form>

    </div>

</div>
