package com.afl.utils.qrcode;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;
import com.afl.utils.except.CommonException;

import java.net.URI;

import static com.afl.utils.constants.ErrorMsgConstants.QRCODE_GEN_ERR;

/**
 * 二维码工具类
 *
 * @Author Lostceleste
 * @Version 1.0
 * @Date 2023-06-07 20:48
 */
public class QRCodeUtil {

    private static final int W = 300;
    private static final int H = 300;

    private static final String default_path = "/";


    /**
     * 根据内容生成二维码
     * @param text
     * @param targetPath
     */
    public static void encodeToQrCode(String text, String targetPath) {
        if(StrUtil.isEmpty(text)) {
            text = StrUtil.EMPTY;
        }
        try {
            QrCodeUtil.generate(text, W, H, FileUtil.file(targetPath));
        } catch (Exception e) {
            throw new CommonException(QRCODE_GEN_ERR);
        }
    }

    /**
     * 生成带logo的二维码
     * @param text
     * @param logo
     * @param targetPath
     */
    public static void encodeToQrCode(String text, String logo, String targetPath) {
        if(StrUtil.isEmpty(text)) {
            text = StrUtil.EMPTY;
        }
        QrConfig qrConfig = createQrConfig(logo);
        try {
            QrCodeUtil.generate(text, qrConfig, FileUtil.file(targetPath));
        } catch (Exception e) {
            throw new CommonException(QRCODE_GEN_ERR);
        }
    }

    private static QrConfig createQrConfig(String logo) {
        QrConfig qrConfig = QrConfig.create();
        qrConfig.setWidth(W);
        qrConfig.setHeight(H);
        qrConfig.setImg(logo);
        return qrConfig;
    }





}
