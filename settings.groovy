environments {
    dev {
        jdbc {
            driver = 'com.mysql.jdbc.Driver'
            url ='jdbc:mysql://localhost:3306/dev?useUnicode=true&amp;characterEncoding=utf8'
            user = 'dev'
            password = 'dev'
        }
    }

    test {
        jdbc {
            driver = 'com.mysql.jdbc.Driver'
            url ='jdbc:mysql://work.kydee.cn:3306/jdasst_test?useUnicode=true&amp;characterEncoding=utf8'
            user = 'jdasst_test'
            password = 'jdasst_test'
        }
    }

    prod {
        jdbc {
            driver = 'com.mysql.jdbc.Driver'
            url ='jdbc:mysql://work.kydee.cn:3306/jdasst_prod?useUnicode=true&amp;characterEncoding=utf8'
            user = 'jdasst_prod'
            password = 'jdasst_prod'
        }
    }
}