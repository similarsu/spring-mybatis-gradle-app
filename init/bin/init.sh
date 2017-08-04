#!/usr/bin/env bash
/mnt/bin/wait-for.sh db:3306 -s -t 60 -- echo "mysql is up"
basesqldir=/mnt/sql
for sqlfile in `cat ${basesqldir}/sql_list`
    do
        echo "SQL ${sqlfile} start executing..."
        mysql -hdb -P3306 -udev -pdev dev < ${basesqldir}/${sqlfile}
        if [ 0 -eq $? ];then
            echo "SQL ${sqlfile} executed successfully"
        fi
    done