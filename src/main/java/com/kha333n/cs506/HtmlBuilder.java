package com.kha333n.cs506;

public class HtmlBuilder {
    private static StringBuilder stringBuilder = new StringBuilder();

    public static String buildDashboardPage(String employeeName){
        stringBuilder.delete(0,stringBuilder.length());
        stringBuilder.append("<!DOCTYPE html>\n");
        stringBuilder.append("<html>\n");
        stringBuilder.append("\n");
        stringBuilder.append("<head>\n");
        stringBuilder.append("    <meta charset=\"utf-8\">\n");
        stringBuilder.append("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\n");
        stringBuilder.append("    <title>ESS</title>\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/fonts/ionicons.min.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/css/Highlight-Blue.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/css/Login-Form-Dark.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n");
        stringBuilder.append("</head>\n");
        stringBuilder.append("\n");
        stringBuilder.append("<body>\n");
        stringBuilder.append("    <div style=\"background: #475d62 url(assets/img/star-sky.jpg);background-size: cover;position: relative;height: 1000px;\">\n");
        stringBuilder.append("        <h1 style=\"text-align: center;padding: 50px;color: var(--blue);\">Dashboard</h1>\n");
        stringBuilder.append("        <div class=\"alert alert-success\" role=\"alert\"><span style=\"text-align: center;padding-left: 42%;\"><strong>Welcome " + employeeName + ".</strong></span></div>\n");
        stringBuilder.append("        <div style=\"padding: 100px;background: #6f7a85;padding-top: 20px;padding-bottom: 20px;\">\n");
        stringBuilder.append("            <h3 class=\"text-center\" style=\"padding-top: 10px;padding-bottom: 50px;border-style: dashed;\">Employee Salary System</h3>\n");
        stringBuilder.append("            <div class=\"table-responsive\" style=\"border-style: solid;\">\n");
        stringBuilder.append("                <table class=\"table\">\n");
        stringBuilder.append("                    <thead>\n");
        stringBuilder.append("                        <tr>\n");
        stringBuilder.append("                            <th style=\"text-align: center;border-right-style: solid;\">View Salary</th>\n");
        stringBuilder.append("                            <th><button class=\"btn btn-primary\" type=\"button\" onclick=\"location.href = &#39;viewsalaryservlet&#39;;\">View</button></th>\n");
        stringBuilder.append("                        </tr>\n");
        stringBuilder.append("                    </thead>\n");
        stringBuilder.append("                    <tbody>\n");
        stringBuilder.append("                        <tr>\n");
        stringBuilder.append("                            <td style=\"text-align: center;font-style: normal;font-weight: bold;border-right-style: solid;\">Withdraw Salary</td>\n");
        stringBuilder.append("                            <td><button class=\"btn btn-primary\" type=\"button\" onclick=\"location.href = &#39;withdrawsalaryservlet&#39;;\">Withdraw</button></td>\n");
        stringBuilder.append("                        </tr>\n");
        stringBuilder.append("                        <tr>\n");
        stringBuilder.append("                            <td style=\"text-align: center;font-weight: bold;border-right-style: solid;\">Logout System</td>\n");
        stringBuilder.append("                            <td><button class=\"btn btn-primary\" type=\"button\" onclick=\"location.href = &#39;logout&#39;;\">Logout</button></td>\n");
        stringBuilder.append("                        </tr>\n");
        stringBuilder.append("                    </tbody>\n");
        stringBuilder.append("                </table>\n");
        stringBuilder.append("            </div>\n");
        stringBuilder.append("        </div>\n");
        stringBuilder.append("    </div>\n");
        stringBuilder.append("    <script src=\"assets/js/jquery.min.js\"></script>\n");
        stringBuilder.append("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
        stringBuilder.append("</body>\n");
        stringBuilder.append("\n");
        stringBuilder.append("</html>");

        return stringBuilder.toString();
    }

    public static String buildLoginFailedPage(String failureReason){
        stringBuilder.delete(0,stringBuilder.length());
        stringBuilder.append("<!DOCTYPE html>\n");
        stringBuilder.append("<html>\n");
        stringBuilder.append("\n");
        stringBuilder.append("<head>\n");
        stringBuilder.append("    <meta charset=\"utf-8\">\n");
        stringBuilder.append("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\n");
        stringBuilder.append("    <title>ESS</title>\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/fonts/ionicons.min.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/css/Highlight-Blue.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/css/Login-Form-Dark.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n");
        stringBuilder.append("</head>\n");
        stringBuilder.append("\n");
        stringBuilder.append("<body>\n");
        stringBuilder.append("    <div style=\"background: #475d62 url(assets/img/star-sky.jpg);background-size: cover;position: relative;height: 1000px;\">\n");
        stringBuilder.append("        <h1 style=\"text-align: center;padding: 50px;color: var(--blue);\">Error Occurred!</h1>\n");
        stringBuilder.append("        <div class=\"alert alert-success\" role=\"alert\"><span style=\"text-align: center;padding-left: 42%;\"><strong>"+ failureReason +"</strong><br></span></div>\n");
        stringBuilder.append("        <div style=\"padding: 100px;padding-left: 42%;\"><button class=\"btn btn-primary\" type=\"button\" onclick=\"location.href = &#39;index.html&#39;;\" style=\"font-weight: bold;text-align: center;font-size: 25px;\">Go back to Login</button></div>\n");
        stringBuilder.append("    </div>\n");
        stringBuilder.append("    <script src=\"assets/js/jquery.min.js\"></script>\n");
        stringBuilder.append("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
        stringBuilder.append("</body>\n");
        stringBuilder.append("\n");
        stringBuilder.append("</html>");

        return stringBuilder.toString();
    }

    public static String buildLogoutPage(){
        stringBuilder.delete(0,stringBuilder.length());
        stringBuilder.append("<!DOCTYPE html>\n");
        stringBuilder.append("<html>\n");
        stringBuilder.append("\n");
        stringBuilder.append("<head>\n");
        stringBuilder.append("    <meta charset=\"utf-8\">\n");
        stringBuilder.append("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\n");
        stringBuilder.append("    <title>ESS</title>\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/fonts/ionicons.min.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/css/Highlight-Blue.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/css/Login-Form-Dark.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n");
        stringBuilder.append("</head>\n");
        stringBuilder.append("\n");
        stringBuilder.append("<body>\n");
        stringBuilder.append("    <div style=\"background: #475d62 url(assets/img/star-sky.jpg);background-size: cover;position: relative;height: 550px;\">\n");
        stringBuilder.append("        <h1 style=\"text-align: center;padding: 50px;color: var(--blue);\">Logged Out!</h1>\n");
        stringBuilder.append("        <div class=\"alert alert-success\" role=\"alert\"><span style=\"text-align: center;padding-left: 42%;font-size: 40px;\"><strong>Thank You.</strong><br></span></div>\n");
        stringBuilder.append("        <div style=\"padding: 100px;padding-left: 42%;\"><button class=\"btn btn-primary\" type=\"button\" onclick=\"location.href = &#39;index.html&#39;;\" style=\"font-weight: bold;text-align: center;font-size: 25px;\">Go back to Login</button></div>\n");
        stringBuilder.append("    </div>\n");
        stringBuilder.append("    <div class=\"highlight-blue\">\n");
        stringBuilder.append("        <div class=\"container\">\n");
        stringBuilder.append("            <div class=\"intro\">\n");
        stringBuilder.append("                <h2 class=\"text-center\">Developed By:</h2>\n");
        stringBuilder.append("                <p class=\"text-center\">Usman Khan.<br>Student ID: BC190201004<br>Employee Salary System.</p>\n");
        stringBuilder.append("            </div>\n");
        stringBuilder.append("            <div class=\"buttons\"></div>\n");
        stringBuilder.append("        </div>\n");
        stringBuilder.append("    </div>\n");
        stringBuilder.append("    <script src=\"assets/js/jquery.min.js\"></script>\n");
        stringBuilder.append("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
        stringBuilder.append("</body>\n");
        stringBuilder.append("\n");
        stringBuilder.append("</html>");

        return stringBuilder.toString();
    }

    public static String buildViewSalaryPage(int currentBalance, String employeeID, String employeeName,
                                             int salaryPerMonth){
        stringBuilder.delete(0,stringBuilder.length());
        stringBuilder.append("<!DOCTYPE html>\n");
        stringBuilder.append("<html>\n");
        stringBuilder.append("\n");
        stringBuilder.append("<head>\n");
        stringBuilder.append("    <meta charset=\"utf-8\">\n");
        stringBuilder.append("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\n");
        stringBuilder.append("    <title>ESS</title>\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/fonts/ionicons.min.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/css/Highlight-Blue.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/css/Login-Form-Dark.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n");
        stringBuilder.append("</head>\n");
        stringBuilder.append("\n");
        stringBuilder.append("<body>\n");
        stringBuilder.append("    <div style=\"background: #475d62 url(assets/img/star-sky.jpg);background-size: cover;position: relative;height: 1000px;\">\n");
        stringBuilder.append("        <h1 style=\"text-align: center;padding: 50px;color: var(--blue);\">Salary Details</h1>\n");
        stringBuilder.append("        <div class=\"alert alert-success\" role=\"alert\"><span style=\"text-align: center;padding-left: 30%;font-size: 20px;\"><strong>Your current salary balance is Rs. "+ currentBalance +"</strong></span></div>\n");
        stringBuilder.append("        <div style=\"padding: 100px;background: #6f7a85;padding-top: 20px;padding-bottom: 20px;\">\n");
        stringBuilder.append("            <h3 class=\"text-center\" style=\"padding-top: 10px;padding-bottom: 20px;font-size: 20px;border-style: dashed;\">Details</h3>\n");
        stringBuilder.append("            <div class=\"table-responsive\" style=\"border-style: solid;\">\n");
        stringBuilder.append("                <table class=\"table\">\n");
        stringBuilder.append("                    <thead>\n");
        stringBuilder.append("                        <tr>\n");
        stringBuilder.append("                            <th style=\"text-align: center;border-right-style: solid;\">Employee ID</th>\n");
        stringBuilder.append("                            <th style=\"padding: 10px;width: 50%;font-weight: normal;\">"+ employeeID +"</th>\n");
        stringBuilder.append("                        </tr>\n");
        stringBuilder.append("                    </thead>\n");
        stringBuilder.append("                    <tbody>\n");
        stringBuilder.append("                        <tr>\n");
        stringBuilder.append("                            <td style=\"text-align: center;font-style: normal;font-weight: bold;border-right-style: solid;\">Name</td>\n");
        stringBuilder.append("                            <td>"+ employeeName +"</td>\n");
        stringBuilder.append("                        </tr>\n");
        stringBuilder.append("                        <tr>\n");
        stringBuilder.append("                            <td style=\"text-align: center;font-weight: bold;border-right-style: solid;\">Salary Per Month</td>\n");
        stringBuilder.append("                            <td>");
        stringBuilder.append(salaryPerMonth);
        stringBuilder.append("</td>\n");
        stringBuilder.append("                        </tr>\n");
        stringBuilder.append("                        <tr>\n");
        stringBuilder.append("                            <td style=\"text-align: center;font-weight: bold;border-right-style: solid;\">Current Balance</td>\n");
        stringBuilder.append("                            <td>"+ currentBalance +"</td>\n");
        stringBuilder.append("                        </tr>\n");
        stringBuilder.append("                    </tbody>\n");
        stringBuilder.append("                </table>\n");
        stringBuilder.append("            </div>\n");
        stringBuilder.append("            <h1 style=\"font-size: 21px;border-style: dashed;padding-top: 10px;padding-bottom: 10px;margin-top: 10px;margin-bottom: 10px;text-align: center;\">Would you like to Withdraw Salary? Press \"Yes\" to confirm or \"No\" to go back.</h1><button class=\"btn btn-primary\" type=\"button\" onclick=\"location.href = &#39;withdrawsalaryservlet&#39;;\" style=\"font-weight: bold;margin-left: 30%;font-size: 25px;\">Yes</button><button class=\"btn btn-primary\" type=\"button\" onclick=\"location.href = &#39;employeeservicesservlet&#39;;\" style=\"margin-left: 30%;font-weight: bold;font-size: 25px;\">No</button>\n");
        stringBuilder.append("        </div>\n");
        stringBuilder.append("    </div>\n");
        stringBuilder.append("    <script src=\"assets/js/jquery.min.js\"></script>\n");
        stringBuilder.append("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
        stringBuilder.append("</body>\n");
        stringBuilder.append("\n");
        stringBuilder.append("</html>");

        return stringBuilder.toString();
    }

    public static String buildWithdrawSalaryPage(){
        stringBuilder.delete(0,stringBuilder.length());
        stringBuilder.append("<!DOCTYPE html>\n");
        stringBuilder.append("<html>\n");
        stringBuilder.append("\n");
        stringBuilder.append("<head>\n");
        stringBuilder.append("    <meta charset=\"utf-8\">\n");
        stringBuilder.append("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\n");
        stringBuilder.append("    <title>ESS</title>\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/fonts/ionicons.min.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/css/Highlight-Blue.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/css/Login-Form-Dark.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n");
        stringBuilder.append("</head>\n");
        stringBuilder.append("\n");
        stringBuilder.append("<body>\n");
        stringBuilder.append("    <div style=\"background: #475d62 url(assets/img/star-sky.jpg);background-size: cover;position: relative;height: 1000px;\">\n");
        stringBuilder.append("        <h1 style=\"text-align: center;padding: 50px;color: var(--blue);\">Withdraw Salary</h1>\n");
        stringBuilder.append("        <div class=\"alert alert-success\" role=\"alert\"><span style=\"text-align: center;padding-left: 35%;font-size: 18px;\"><strong>Please enter Withdraw Salary Amount and press \"OK\"</strong>&nbsp;<strong>to Confirm.&nbsp;</strong><br></span><span style=\"text-align: center;padding-left: 25%;\"><strong>(NOTE: Amount must be in multiple of 1,000 and upto a maximum&nbsp; of Rs. 30,000/- per withdrawal.)</strong><br></span></div>\n");
        stringBuilder.append("        <div style=\"padding: 100px;background: #6f7a85;padding-top: 20px;padding-bottom: 20px;\">\n");
        stringBuilder.append("            <form name=\"withdrawForm\" action=\"withdrawauthenticate\">\n");
        stringBuilder.append("                <div class=\"table-responsive\" style=\"border-style: solid;\">\n");
        stringBuilder.append("                    <table class=\"table\">\n");
        stringBuilder.append("                        <thead>\n");
        stringBuilder.append("                            <tr>\n");
        stringBuilder.append("                                <th style=\"text-align: center;border-right-style: solid;\">Amount</th>\n");
        stringBuilder.append("                                <th style=\"border-right-style: solid;width: 400px;\" name=\"withdraw_amount\"><input class=\"form-control\" type=\"number\" name=\"input\" style=\"width: 300px;\"></th>\n");
        stringBuilder.append("                                <th><button class=\"btn btn-primary\" type=\"reset\">Reset</button></th>\n");
        stringBuilder.append("                            </tr>\n");
        stringBuilder.append("                        </thead>\n");
        stringBuilder.append("                        <tbody></tbody>\n");
        stringBuilder.append("                    </table>\n");
        stringBuilder.append("                </div><button class=\"btn btn-primary\" type=\"submit\" style=\"text-align: center;font-weight: bold;border-style: dotted;font-size: 20px;margin-left: 42%;margin-top: 10px;\"><strong>OK</strong></button>\n");
        stringBuilder.append("            </form>\n");
        stringBuilder.append("        </div>\n");
        stringBuilder.append("    </div>\n");
        stringBuilder.append("    <script src=\"assets/js/jquery.min.js\"></script>\n");
        stringBuilder.append("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
        stringBuilder.append("</body>\n");
        stringBuilder.append("\n");
        stringBuilder.append("</html>");

        return stringBuilder.toString();
    }

    public static String buildWithdrawSalaryFailedPage(){
        stringBuilder.delete(0,stringBuilder.length());
        stringBuilder.append("<!DOCTYPE html>\n");
        stringBuilder.append("<html>\n");
        stringBuilder.append("\n");
        stringBuilder.append("<head>\n");
        stringBuilder.append("    <meta charset=\"utf-8\">\n");
        stringBuilder.append("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\n");
        stringBuilder.append("    <title>ESS</title>\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/fonts/ionicons.min.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/css/Highlight-Blue.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/css/Login-Form-Dark.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n");
        stringBuilder.append("</head>\n");
        stringBuilder.append("\n");
        stringBuilder.append("<body>\n");
        stringBuilder.append("    <div style=\"background: #475d62 url(assets/img/star-sky.jpg);background-size: cover;position: relative;height: 1000px;\">\n");
        stringBuilder.append("        <h1 style=\"text-align: center;padding: 50px;color: var(--blue);\">Withdraw Salary</h1>\n");
        stringBuilder.append("        <div class=\"alert alert-success\" role=\"alert\"><span style=\"text-align: center;padding-left: 35%;font-size: 18px;\"><strong>Invalid Amount Entered!</strong><br></span></div>\n");
        stringBuilder.append("        <div style=\"padding: 100px;background: #6f7a85;padding-top: 20px;padding-bottom: 20px;\"><button class=\"btn btn-primary\" type=\"button\" style=\"text-align: center;font-weight: bold;border-style: dotted;font-size: 20px;margin-left: 42%;margin-top: 10px;\" onclick=\"location.href = &#39;withdrawsalaryservlet&#39;;\"><strong>OK</strong></button></div>\n");
        stringBuilder.append("    </div>\n");
        stringBuilder.append("    <script src=\"assets/js/jquery.min.js\"></script>\n");
        stringBuilder.append("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
        stringBuilder.append("</body>\n");
        stringBuilder.append("\n");
        stringBuilder.append("</html>");
        return stringBuilder.toString();
    }

    public static String buildWithdrawSalarySuccessfulPage(){
        stringBuilder.delete(0,stringBuilder.length());
        stringBuilder.append("<!DOCTYPE html>\n");
        stringBuilder.append("<html>\n");
        stringBuilder.append("\n");
        stringBuilder.append("<head>\n");
        stringBuilder.append("    <meta charset=\"utf-8\">\n");
        stringBuilder.append("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\n");
        stringBuilder.append("    <title>ESS</title>\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/fonts/ionicons.min.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/css/Highlight-Blue.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/css/Login-Form-Dark.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n");
        stringBuilder.append("</head>\n");
        stringBuilder.append("\n");
        stringBuilder.append("<body>\n");
        stringBuilder.append("    <div style=\"background: #475d62 url(assets/img/star-sky.jpg);background-size: cover;position: relative;height: 1000px;\">\n");
        stringBuilder.append("        <h1 style=\"text-align: center;padding: 50px;color: var(--blue);\">Withdraw Salary</h1>\n");
        stringBuilder.append("        <div class=\"alert alert-success\" role=\"alert\"><span style=\"text-align: center;padding-left: 35%;font-size: 18px;\"><strong>Salary has be withdrawn successfully!</strong><br></span></div>\n");
        stringBuilder.append("        <div style=\"padding: 100px;background: #6f7a85;padding-top: 20px;padding-bottom: 20px;\"><button class=\"btn btn-primary\" type=\"button\" style=\"text-align: center;font-weight: bold;border-style: dotted;font-size: 20px;margin-left: 42%;margin-top: 10px;\" onclick=\"location.href = &#39;employeeservicesservlet&#39;;\"><strong>OK</strong></button></div>\n");
        stringBuilder.append("    </div>\n");
        stringBuilder.append("    <script src=\"assets/js/jquery.min.js\"></script>\n");
        stringBuilder.append("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
        stringBuilder.append("</body>\n");
        stringBuilder.append("\n");
        stringBuilder.append("</html>");

        return stringBuilder.toString();
    }

    public static String buildIndexPage(){
        stringBuilder.delete(0,stringBuilder.length());
        stringBuilder.append("<!DOCTYPE html>\n");
        stringBuilder.append("<html>\n");
        stringBuilder.append("\n");
        stringBuilder.append("<head>\n");
        stringBuilder.append("    <meta charset=\"utf-8\">\n");
        stringBuilder.append("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\n");
        stringBuilder.append("    <title>ESS</title>\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/fonts/ionicons.min.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/css/Highlight-Blue.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/css/Login-Form-Dark.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n");
        stringBuilder.append("</head>\n");
        stringBuilder.append("\n");
        stringBuilder.append("<body>\n");
        stringBuilder.append("    <div class=\"login-dark\">\n");
        stringBuilder.append("        <h1 style=\"color: var(--purple);text-align: center;\">Employee Salary System (ESS)</h1>\n");
        stringBuilder.append("        <form method=\"post\" action=\"authenticate\" name=\"loginForm\">\n");
        stringBuilder.append("            <h2 class=\"sr-only\">Login Form</h2>\n");
        stringBuilder.append("            <div class=\"illustration\"><i class=\"icon ion-ios-locked-outline\"></i></div>\n");
        stringBuilder.append("            <div class=\"form-group\"><input class=\"form-control\" type=\"text\" placeholder=\"Employee ID\" name=\"employee_id\"></div>\n");
        stringBuilder.append("            <div class=\"form-group\"><input class=\"form-control\" type=\"password\" name=\"employee_password\" placeholder=\"Password\"></div>\n");
        stringBuilder.append("            <div class=\"form-group\"><button class=\"btn btn-primary btn-block\" type=\"submit\">Log In</button><button class=\"btn btn-primary btn-block\" type=\"reset\">Clear</button></div>\n");
        stringBuilder.append("        </form>\n");
        stringBuilder.append("    </div>\n");
        stringBuilder.append("    <script src=\"assets/js/jquery.min.js\"></script>\n");
        stringBuilder.append("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
        stringBuilder.append("</body>\n");
        stringBuilder.append("\n");
        stringBuilder.append("</html>");

        return stringBuilder.toString();
    }

    public static String buildWithdrawSalaryNotAllowed(){
        stringBuilder.delete(0,stringBuilder.length());
        stringBuilder.append("<!DOCTYPE html>\n");
        stringBuilder.append("<html>\n");
        stringBuilder.append("\n");
        stringBuilder.append("<head>\n");
        stringBuilder.append("    <meta charset=\"utf-8\">\n");
        stringBuilder.append("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\n");
        stringBuilder.append("    <title>ESS</title>\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/fonts/ionicons.min.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/css/Highlight-Blue.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/css/Login-Form-Dark.css\">\n");
        stringBuilder.append("    <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n");
        stringBuilder.append("</head>\n");
        stringBuilder.append("\n");
        stringBuilder.append("<body>\n");
        stringBuilder.append("    <div style=\"background: #475d62 url(assets/img/star-sky.jpg);background-size: cover;position: relative;height: 1000px;\">\n");
        stringBuilder.append("        <h1 style=\"text-align: center;padding: 50px;color: var(--blue);\">Withdraw Salary</h1>\n");
        stringBuilder.append("        <div class=\"alert alert-success\" role=\"alert\"><span style=\"text-align: center;padding-left: 35%;font-size: 18px;\"><strong>You do not have enough balance!</strong><br></span></div>\n");
        stringBuilder.append("        <div style=\"padding: 100px;background: #6f7a85;padding-top: 20px;padding-bottom: 20px;\"><button class=\"btn btn-primary\" type=\"button\" style=\"text-align: center;font-weight: bold;border-style: dotted;font-size: 20px;margin-left: 42%;margin-top: 10px;\" onclick=\"location.href = &#39;withdrawsalaryservlet&#39;;\"><strong>OK</strong></button></div>\n");
        stringBuilder.append("    </div>\n");
        stringBuilder.append("    <script src=\"assets/js/jquery.min.js\"></script>\n");
        stringBuilder.append("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
        stringBuilder.append("</body>\n");
        stringBuilder.append("\n");
        stringBuilder.append("</html>");
        return stringBuilder.toString();
    }
}
