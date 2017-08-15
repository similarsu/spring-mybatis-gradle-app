environments {
    dev {
        jdbc {
            driver = 'com.mysql.jdbc.Driver'
            url ='jdbc:mysql://localhost:3306/dev?useUnicode=true&amp;characterEncoding=utf8'
            user = 'dev'
            password = 'dev'
        }

        logger {
            pattern = '%d{yyyy-MM-dd HH:mm:ss} %-5level %logger{36} - %msg%n'
            dir = ''
            root {
                level = 'WARN'
                appender = 'consoleAppender'
            }

            me {
                level = 'DEBUG'
                appender = 'consoleAppender'
            }

            sql {
                level = 'DEBUG'
                appender = 'consoleAppender'
            }
        }
    }

    test {
        jdbc {
            driver = 'com.mysql.jdbc.Driver'
            url ='jdbc:mysql://work.kydee.cn:3306/jdasst_test?useUnicode=true&amp;characterEncoding=utf8'
            user = 'jdasst_test'
            password = 'jdasst_test'
        }

        logger {
            pattern = '%d{yyyy-MM-dd HH:mm:ss} %-5level %logger{36} - %msg%n'
        }
    }

    prod {
        jdbc {
            driver = 'com.mysql.jdbc.Driver'
            url ='jdbc:mysql://work.kydee.cn:3306/jdasst_prod?useUnicode=true&amp;characterEncoding=utf8'
            user = 'jdasst_prod'
            password = 'jdasst_prod'
        }

        logger {
            pattern = '%d{yyyy-MM-dd HH:mm:ss} %-5level %logger{36} - %msg%n'
        }
    }
}