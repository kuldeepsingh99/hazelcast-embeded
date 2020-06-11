# hazelcast embeded cache with Spring boot and Mysql

## Prerequisite 

We will be deploying this in kubernetes cluster, so make sure kubernetes is install and cluster is ready

Down the customer service and create your own image, and change the image path [here](https://github.com/kuldeepsingh99/hazelcast-embeded/blob/master/deployment/customer.yml#L19)


## Step 1 ( Creating secrets)

Execute these statements

```
kubectl create secret generic mysql-root-pass --from-literal=password=root

kubectl create secret generic mysql-user-pass --from-literal=username=root --from-literal=password=root

kubectl create secret generic mysql-db-url --from-literal=database=customerdb
```

## Step 2 (Deploying mysql DB)

Run this command to create mysql DB container
```
kubectl apply -f mysql.yml
```

mysql.yml file is [here](https://github.com/kuldeepsingh99/hazelcast-embeded/blob/master/deployment/mysql.yml)

check whether pods/service/deploymeny are created with these command
```
kubectl get deploy
kubectl get svc
kubectl get pods
```

## Step 3 (Deploying customer service)

Run this command to create mysql DB container
```
kubectl apply -f customer.yml
```

mysql.yml file is [here](https://github.com/kuldeepsingh99/hazelcast-embeded/blob/master/deployment/customer.yml)

check whether pods/service/deploymeny are created with these command
```
kubectl get deploy
kubectl get svc
kubectl get pods
```
