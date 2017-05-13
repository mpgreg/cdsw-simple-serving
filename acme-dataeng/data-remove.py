
#remove the training dataset to save $$$
!hdfs dfs -rm -f /tmp/datatraining.txt
!hdfs dfs -rm -f /tmp/datatraining.csv

#remove the temporary directory
#!hdfs dfs -rmdir /tmp/clouderanM
