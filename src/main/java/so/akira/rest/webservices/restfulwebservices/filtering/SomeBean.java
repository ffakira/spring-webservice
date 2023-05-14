package so.akira.rest.webservices.restfulwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
// import com.fasterxml.jackson.annotation.JsonIgnore;
// import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// @JsonIgnoreProperties("field1")
@JsonFilter("SomeBeanFilter")
record SomeBean(String field1, String field2, String field3) {
// record SomeBean(String field1, @JsonIgnore String field2, String field3) {
  @Override
  public String toString() {
    return String.format("SomeBean [field1=%s, field2=%s, field3=%s]", field1, field2, field3);
  }
}
