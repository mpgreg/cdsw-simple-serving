import sys.process._

//download the data
"curl -o occupancy_data.zip http://archive.ics.uci.edu/ml/machine-learning-databases/00357/occupancy_data.zip" !

//unzip the data
"unzip occupancy_data.zip" !

//make a directory in HDFS
"hdfs dfs -mkdir /tmp/clouderanM" !

//put the training data in HDFS
"hdfs dfs -put -f datatraining.txt /tmp/clouderanM" !

//delete the download remnants
"rm occupancy_data.zip datatest.txt datatest2.txt datatraining.txt" !
