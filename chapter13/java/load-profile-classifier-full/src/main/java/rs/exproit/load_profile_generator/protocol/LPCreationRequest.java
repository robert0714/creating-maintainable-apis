/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package rs.exproit.load_profile_generator.protocol;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class LPCreationRequest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5018867885540601647L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LPCreationRequest\",\"namespace\":\"rs.exproit.load_profile_generator.protocol\",\"fields\":[{\"name\":\"loadCondition\",\"type\":[\"null\",\"string\"],\"doc\":\"The identifier for the referenced data (may be null if the controller doesn't collect meta-data).\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The identifier for the referenced data (may be null if the controller doesn't collect meta-data). */
  @Deprecated public java.lang.CharSequence loadCondition;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public LPCreationRequest() {}

  /**
   * All-args constructor.
   * @param loadCondition The identifier for the referenced data (may be null if the controller doesn't collect meta-data).
   */
  public LPCreationRequest(java.lang.CharSequence loadCondition) {
    this.loadCondition = loadCondition;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return loadCondition;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: loadCondition = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'loadCondition' field.
   * @return The identifier for the referenced data (may be null if the controller doesn't collect meta-data).
   */
  public java.lang.CharSequence getLoadCondition() {
    return loadCondition;
  }

  /**
   * Sets the value of the 'loadCondition' field.
   * The identifier for the referenced data (may be null if the controller doesn't collect meta-data).
   * @param value the value to set.
   */
  public void setLoadCondition(java.lang.CharSequence value) {
    this.loadCondition = value;
  }

  /**
   * Creates a new LPCreationRequest RecordBuilder.
   * @return A new LPCreationRequest RecordBuilder
   */
  public static rs.exproit.load_profile_generator.protocol.LPCreationRequest.Builder newBuilder() {
    return new rs.exproit.load_profile_generator.protocol.LPCreationRequest.Builder();
  }

  /**
   * Creates a new LPCreationRequest RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new LPCreationRequest RecordBuilder
   */
  public static rs.exproit.load_profile_generator.protocol.LPCreationRequest.Builder newBuilder(rs.exproit.load_profile_generator.protocol.LPCreationRequest.Builder other) {
    return new rs.exproit.load_profile_generator.protocol.LPCreationRequest.Builder(other);
  }

  /**
   * Creates a new LPCreationRequest RecordBuilder by copying an existing LPCreationRequest instance.
   * @param other The existing instance to copy.
   * @return A new LPCreationRequest RecordBuilder
   */
  public static rs.exproit.load_profile_generator.protocol.LPCreationRequest.Builder newBuilder(rs.exproit.load_profile_generator.protocol.LPCreationRequest other) {
    return new rs.exproit.load_profile_generator.protocol.LPCreationRequest.Builder(other);
  }

  /**
   * RecordBuilder for LPCreationRequest instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LPCreationRequest>
    implements org.apache.avro.data.RecordBuilder<LPCreationRequest> {

    /** The identifier for the referenced data (may be null if the controller doesn't collect meta-data). */
    private java.lang.CharSequence loadCondition;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(rs.exproit.load_profile_generator.protocol.LPCreationRequest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.loadCondition)) {
        this.loadCondition = data().deepCopy(fields()[0].schema(), other.loadCondition);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing LPCreationRequest instance
     * @param other The existing instance to copy.
     */
    private Builder(rs.exproit.load_profile_generator.protocol.LPCreationRequest other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.loadCondition)) {
        this.loadCondition = data().deepCopy(fields()[0].schema(), other.loadCondition);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'loadCondition' field.
      * The identifier for the referenced data (may be null if the controller doesn't collect meta-data).
      * @return The value.
      */
    public java.lang.CharSequence getLoadCondition() {
      return loadCondition;
    }

    /**
      * Sets the value of the 'loadCondition' field.
      * The identifier for the referenced data (may be null if the controller doesn't collect meta-data).
      * @param value The value of 'loadCondition'.
      * @return This builder.
      */
    public rs.exproit.load_profile_generator.protocol.LPCreationRequest.Builder setLoadCondition(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.loadCondition = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'loadCondition' field has been set.
      * The identifier for the referenced data (may be null if the controller doesn't collect meta-data).
      * @return True if the 'loadCondition' field has been set, false otherwise.
      */
    public boolean hasLoadCondition() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'loadCondition' field.
      * The identifier for the referenced data (may be null if the controller doesn't collect meta-data).
      * @return This builder.
      */
    public rs.exproit.load_profile_generator.protocol.LPCreationRequest.Builder clearLoadCondition() {
      loadCondition = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public LPCreationRequest build() {
      try {
        LPCreationRequest record = new LPCreationRequest();
        record.loadCondition = fieldSetFlags()[0] ? this.loadCondition : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}