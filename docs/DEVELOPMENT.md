# Development Guide Lines

## Build

Currently, one of the projects mvn package deps is hosted on GitHub.
GitHub's mvn repo needs an access token even on public packages.
Configure the 'development/maven-gh-settings.xml' and set your GitHub-accesstoken there.

```shell
mvn clean verify -s development/maven-gh-settings.xml
```

## Tag and Release a new version

Activate the GH-workflow with a tag and push

Example:

```shell
git tag -s v0.0.32 -m 'v0.0.32'
git push origin 
```

(Currently a gh-workflow with jrelaser wil act on Tag pushes.
It sets the Pom-version, generates a changelog, releases the library to GitHub Mvn Package Registry, signs the release etc.)

In the future, we will describe how to run that flow locally so that you can verify the output locally.

## Run same code quality test locally as in CI

```shell
./developement/codequality.sh
```