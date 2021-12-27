package me.zhengjie.rest;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.zhengjie.annotation.AnonymousAccess;
import me.zhengjie.domain.digital.DigitalRefPhone;
import me.zhengjie.service.DigitalRefService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author enlich
 * @Description 数码参考
 * @createTime 2021-12-26 13:05:00
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/digitalRef")
@Api(tags = "数码参考")
public class DigitalRefController {

    private final DigitalRefService refRepository;

    @RequestMapping("/getHotPhoneList")
    @AnonymousAccess
    public ResponseEntity<List<DigitalRefPhone>> getHotPhoneList() {
        return new ResponseEntity<>(refRepository.getHotPhoneList(), HttpStatus.OK);
    }

    @RequestMapping("/getPhoneDetailsById")
    @AnonymousAccess
    public ResponseEntity<DigitalRefPhone> getPhoneDetailsById(HttpServletRequest request) {
        String phoneId = request.getParameter("phoneId");
        return new ResponseEntity<>(refRepository.getPhoneDetailsById(phoneId), HttpStatus.OK);
    }
}
