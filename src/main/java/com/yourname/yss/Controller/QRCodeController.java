//package com.yourname.yss.Controller;
//
//import com.yourname.yss.Entity.QRCode;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/qrcode")
//@RequiredArgsConstructor
//public class QRCodeController {
//
//    private final QRCodeService qrCodeService;
//
//    @PostMapping("/generate")
//    public QRCode generateQRCode(@RequestParam Long yachakId) {
//        return qrCodeService.generateQRCodeForYachak(yachakId);
//    }
//
//    @GetMapping("/{id}")
//    public QRCode getQRCode(@PathVariable Long id) {
//        return qrCodeService.getQRCodeById(id);
//    }
//
//    // Add more endpoints as needed
//}
