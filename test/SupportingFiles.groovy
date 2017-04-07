import spock.lang.*

class SupportingFilesSpec extends Specification {
  def ".editorconfig exists"() {
    expect:
      new File('.editorconfig').exists()
  }

  def ".gitignore exists"() {
    expect:
      new File('.gitignore').exists()
  }

  def "CHANGELOG.md exists"() {
    expect:
      new File('CHANGELOG.md').exists()
  }

  def "LICENSE exists"() {
    expect:
      new File('LICENSE').exists()
  }

  def "README.md exists"() {
    expect:
      new File('README.md').exists()
  }
}
