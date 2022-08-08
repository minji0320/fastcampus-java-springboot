package com.example.lottonumbergenerator.controller;

import com.example.lottonumbergenerator.domain.LottoNumber;
import com.example.lottonumbergenerator.service.LottoNumberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class LottoNumberController {

    private final LottoNumberService lottoNumberService;

    @PostMapping("/lotto")
    public void create(@RequestBody Map<String, String> creatorNameMap) {
        lottoNumberService.createLottoNumber(creatorNameMap.get("creator_name"));
    }

    @GetMapping("/lotto")
    public List<LottoNumber> read() {
        return lottoNumberService.readLottoNumberList();
    }

    @DeleteMapping("/lotto/{lottoId}")
    public void delete(@PathVariable int lottoId) {
        lottoNumberService.deleteLottoNumberList(lottoId);
    }

}
