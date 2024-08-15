//package com.yourname.yss.Service.ServiceImpl;
//
//import com.yourname.yss.Service.QRCodeService;
//import org.springframework.stereotype.Service;
//
//import java.awt.image.BufferedImage;
//import java.io.ByteArrayOutputStream;
//import java.io.IOException;
//
//import com.google.zxing.BarcodeFormat;
//import com.google.zxing.WriterException;
//import com.google.zxing.qrcode.QRCodeWriter;
//import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
//import com.google.zxing.qrcode.encoder.Encoder;
//import com.google.zxing.qrcode.encoder.QRCode;
//import com.google.zxing.client.j2se.MatrixToImageWriter;
//
//import javax.imageio.ImageIO;
//
//@Service
//public class QRCodeServiceImpl implements QRCodeService {
//
//    @Override
//    public byte[] generateQRCode(String content) {
//        QRCodeWriter qrCodeWriter = new QRCodeWriter();
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        try {
//            QRCode qrCode = Encoder.encode(content, ErrorCorrectionLevel.L, null);
//            BufferedImage bufferedImage = MatrixToImageWriter.toBufferedImage(qrCode);
//            ImageIO.write(bufferedImage, "PNG", baos);
//        } catch (WriterException | IOException e) {
//            e.printStackTrace();
//        }
//        return baos.toByteArray();
//    }
//}
