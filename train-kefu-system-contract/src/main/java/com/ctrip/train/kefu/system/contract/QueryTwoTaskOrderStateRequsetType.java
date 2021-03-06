package com.ctrip.train.kefu.system.contract;

import com.ctriposs.baiji.exception.BaijiRuntimeException;
import com.ctriposs.baiji.schema.*;
import com.ctriposs.baiji.specific.*;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

@SuppressWarnings("all")
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility = JsonAutoDetect.Visibility.NONE) 
@JsonPropertyOrder({
    "partnerOrderId"
})
public class QueryTwoTaskOrderStateRequsetType implements SpecificRecord {
    private static final long serialVersionUID = 1L;

	@JsonIgnore
    public static final transient Schema SCHEMA = Schema.parse("{\"type\":\"record\",\"name\":\"QueryTwoTaskOrderStateRequsetType\",\"namespace\":\"" + QueryTwoTaskOrderStateRequsetType.class.getPackage().getName() + "\",\"doc\":null,\"fields\":[{\"name\":\"partnerOrderId\",\"type\":[\"string\",\"null\"]}]}");

    @Override
    @JsonIgnore
    public Schema getSchema() { return SCHEMA; }

    public QueryTwoTaskOrderStateRequsetType(
        String partnerOrderId) {
        this.partnerOrderId = partnerOrderId;
    }

    public QueryTwoTaskOrderStateRequsetType() {
    }

    @JsonProperty("partnerOrderId") 
    public String partnerOrderId;

    public String getPartnerOrderId() {
        return partnerOrderId;
    }

    public void setPartnerOrderId(final String partnerOrderId) {
        this.partnerOrderId = partnerOrderId;
    }

    // Used by DatumWriter. Applications should not call.
    public Object get(int fieldPos) {
        switch (fieldPos) {
            case 0: return this.partnerOrderId;
            default: throw new BaijiRuntimeException("Bad index " + fieldPos + " in get()");
        }
    }

    // Used by DatumReader. Applications should not call.
    @SuppressWarnings(value="unchecked")
    public void put(int fieldPos, Object fieldValue) {
        switch (fieldPos) {
            case 0: this.partnerOrderId = (String)fieldValue; break;
            default: throw new BaijiRuntimeException("Bad index " + fieldPos + " in put()");
        }
    }

    @Override
	public Object get(String fieldName) {
        Schema schema = getSchema();
        if (!(schema instanceof RecordSchema)) {
            return null;
        }
        Field field = ((RecordSchema) schema).getField(fieldName);
        return field != null ? get(field.getPos()) : null;
    }

    @Override
    public void put(String fieldName, Object fieldValue) {
        Schema schema = getSchema();
        if (!(schema instanceof RecordSchema)) {
            return;
        }
        Field field = ((RecordSchema) schema).getField(fieldName);
        if (field != null) {
            put(field.getPos(), fieldValue);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final QueryTwoTaskOrderStateRequsetType other = (QueryTwoTaskOrderStateRequsetType)obj;
        return 
            Objects.equal(this.partnerOrderId, other.partnerOrderId);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + (this.partnerOrderId == null ? 0 : this.partnerOrderId.hashCode());

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("partnerOrderId", partnerOrderId)
            .toString();
    }
}
