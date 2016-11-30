
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add Author</h1>
        <form method="post" action="">
            <div>
                <label>Author Name</label>
                <input type="text" name="authorName" required="required"/>
            </div>
            <div>
                <label>Address</label>
                <input type="text" name="address" required="required"/>
            </div>
            <div>
                <label>Phone</label>
                <input type="text" name="phone" required="required"/>
            </div>
            <div>
                <label>Fax</label>
                <input type="text" name="fax" required="required"/>
            </div>
            <div>
                <label>Email</label>
                <input type="email" name="email" required="required"/>
            </div>
            <div>
                <button type="submit">Submit</button>
            </div>
            <div>
                <button type="reset">Clear</button>
            </div>

        </form>
    </body>
</html>
