FROM public.ecr.aws/lambda/java:11
# Copy function code and runtime dependencies from Maven layout
COPY target/console-0.0.1-SNAPSHOT.jar ${LAMBDA_TASK_ROOT}/lib/
#  COPY target/dependency/* ${LAMBDA_TASK_ROOT}/lib/

# Set the CMD to your handler (could also be done as a parameter override outside of the Dockerfile)
# CMD [ "com.shady.GreetingsHandler::handleRequest" ]

CMD [ "com.example.console.Handler::handleRequest" ]