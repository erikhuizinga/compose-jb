config.plugins = config.plugins || [];
config.plugins = config.plugins.filter(it => it !== "kotlin-test-js-runner/karma-kotlin-reporter.js");
config.plugins.push("../../../../../test-utils/conf/karma-kotlin-runner-decorator/karma-kotlin-reporter-decorated.js");
config.reporters = [];

config.client.mocha = config.client.mocha || {};
config.client.mocha.timeout = 10000;

config.browserNoActivityTimeout = 10000;
config.browserDisconnectTimeout = 10000;
config.browserDisconnectTolerance = 3;

config.concurrency = 1;
