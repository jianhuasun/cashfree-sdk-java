package com.cashfree.lib.payout.domains;

import com.cashfree.lib.annotations.NotNull;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString(callSuper=true)
@Accessors(chain = true)
public class BeneficiaryDetails {
  @NotNull
  private String beneId;

  @NotNull
  private String name;

  @NotNull
  private String email;

  @NotNull
  private String phone;

  private String bankAccount;

  private String ifsc;

  private String vpa;

  private String cardNo;

  private String address1;

  private String city;

  private String state;

  private String pincode;
}
