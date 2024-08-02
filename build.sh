mvn clean install
docker build -t lambda .
docker tag lambda:latest 657641750194.dkr.ecr.us-east-2.amazonaws.com/lambda:latest
docker push 657641750194.dkr.ecr.us-east-2.amazonaws.com/lambda:latest