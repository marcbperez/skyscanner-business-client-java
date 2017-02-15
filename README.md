# skyscanner-business-client-java

A Java client for the SkyScanner Business API. Supports common services such
as currencies, locales, markets, location autosuggest, location information and
referral URLs. The flights cache service is also included, providing cheapest
quotes, cheapest prices by route, cheapest prices by date and grid prices by
date.

## Installation

This projects uses Gradle (at least version 3.3) as its build system along with
a Docker and docker-compose wrapper for continuous development. On Ubuntu Linux
distributions Gradle 3.3 can be installed via the following commands:

```bash
sudo apt-get install software-properties-common
sudo add-apt-repository ppa:cwchien/gradle
sudo apt-get update
sudo apt-get install default-jdk gradle=3.3-0ubuntu1
```

If you prefer to install Docker and docker-compose (highly recommended) refer to
the [official instructions][install-docker-compose] or use the script from
below, again for Ubuntu Linux distributions.

```bash
sudo apt-get install apt-transport-https ca-certificates curl software-properties-common
curl -fsSL https://apt.dockerproject.org/gpg | sudo apt-key add -
sudo add-apt-repository "deb https://apt.dockerproject.org/repo/ ubuntu-$(lsb_release -cs) main"
sudo apt-get update
sudo apt-get install docker-engine
curl -L "https://github.com/docker/compose/releases/download/1.10.0/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose
chmod +x /usr/local/bin/docker-compose
```

## Usage

To build the sources run Gradle's main task from the project's root directory
with `gradle` or via `sudo docker-compose up` if you are using the Docker
wrapper. The second option will start a continuous build and updates will be
built and tested every time a change is made. If all tests pass the compiled JAR
will be placed under `build/libs`. Refer to the tests from the `src/test` folder
for complete API usage and examples.

## Testing

Tests will be executed by default every time the project is built. To run them
manually start a new build or use Gradle's test task. A coverage report will be
generated under `build/test-results/test/index.html`.

```bash
gradle test
```

## Troubleshooting

The [issue tracker][issue-tracker] intends to manage and compile bugs,
enhancements, proposals and tasks. Reading through its material or reporting to
its contributors via the platform is strongly recommended.

## Contributing

This project adheres to [Semantic Versioning][semver] and to certain syntax
conventions defined in [.editorconfig][editorconfig]. To get a list of changes
refer to the [CHANGELOG][changelog]. Only branches prefixed by *feature-*,
*hotfix-*, or *release-* will be considered:

  - Fork the project.
  - Create your new branch: `git checkout -b feature-my-feature develop`
  - Commit your changes: `git commit -am 'Added my new feature.'`
  - Push the branch: `git push -u origin feature-my-feature`
  - Submit a pull request.

## Credits

This project is created by [marcbperez][author] and maintained by its
[author][author] and contributors.

## License

This project is licensed under the [Apache License Version 2.0][license].

[author]: https://marcbperez.github.io
[issue-tracker]: https://github.com/marcbperez/skyscanner-business-client-java/issues
[editorconfig]: .editorconfig
[changelog]: CHANGELOG.md
[license]: LICENSE
[semver]: http://semver.org
[install-docker-compose]: https://docs.docker.com/compose/install/
