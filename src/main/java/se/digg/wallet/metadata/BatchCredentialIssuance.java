package se.digg.wallet.metadata;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchCredentialIssuance {

  @JsonProperty("batch_size")
  private int batchSize;

  public BatchCredentialIssuance(int batchSize) {
    this.batchSize = batchSize;
  }
}
