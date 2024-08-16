package com.turkcell.cmm.core.Dtos.Response.BlacklistResponses;

import com.turkcell.cmm.service.enums.OutReason;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RemoveBlacklistResponse {
    private String  outReason;
    private Long customerId;
    private String inReason;
    private int status;

}
/*  *removeBlacklist servisi: Bir blacklist kaydının durumunu 99’a çekmek için kullanılır.

 *Requestte customerId(zorunlu), inReason(zorunlu), outReason(zorunlu) girilmelidir.

 *customerId ve inReasson kullanılarak blacklist kaydı bulunur. Kyadın statüsü 99
  outReason requesstten gelen reason oalrak set edilir ve outDate bilgisi şimdiki zaman oalrak doldurulur.

 *Eğer kayıt bulunamazsa kayıt bulunamadı hatası verilmelidir.
* */