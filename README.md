# sbt-search-maven-plugin

[![Build Status](https://travis-ci.org/blstream/sbt-search-maven-plugin.svg?branch=master)](https://travis-ci.org/blstream/sbt-search-maven-plugin)

Plugin to search maven artifacts. It uses [search.maven.org](http://search.maven.org/) for querying.

## Usage
### Add to `plugins.sbt`:

    addSbtPlugin("com.blstream" % "sbt-search-maven-plugin" % "0.2.0")

### searching

Plugin adds `searchMaven` task, to find some 'artifact' just type

    searchMaven <artifact>

## Directory structure

* `src/sbt-test` plugin tests using [scripted](https://github.com/sbt/sbt/tree/1.0.x/scripted)
* `test-project` allows quick tests in repl of this plugin functionality (just `reload`)

## Contribution
You can pick feature from future work section of this readme, issue with feature proposal (if any) or fix some bug. Pull requests are very welcome.

## Thanks to all contributors of:

* [sbt](https://github.com/sbt/sbt)
* [sbt-scalariform](https://github.com/sbt/sbt-scalariform)
* [lift-json](https://github.com/lift/lift/tree/master/framework/lift-base/lift-json/)
* [specs2](https://github.com/etorreborre/specs2)

## License
see `LICENSE` file
