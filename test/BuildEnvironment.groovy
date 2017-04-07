import spock.lang.*

class BuildEnvironmentSpec extends Specification {
  def "build.gradle exists"() {
    expect:
      new File('build.gradle').exists()
  }

  def "docker-compose.yml exists"() {
    expect:
      new File('docker-compose.yml').exists()
  }

  def "Dockerfile exists"() {
    expect:
      new File('Dockerfile').exists()
  }
}
