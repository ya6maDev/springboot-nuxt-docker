FROM node:8.15.0-alpine

RUN mkdir /frontend

WORKDIR /frontend

RUN apk update && \
    npm install -g npm && \
    npm install -g @vue/cli && \
    npm install -g @vue/cli-init

ENV HOST 0.0.0.0
EXPOSE 3000

CMD ["/bin/ash"]
ENTRYPOINT ["npm", "run", "dev"]