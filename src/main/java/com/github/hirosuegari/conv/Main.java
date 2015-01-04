package com.github.hirosuegari.conv;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * 半角カナのみ取り扱う前提として、バイト配列は使わない。
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 対象のディレクトリからファイルを読み取る（以下、ファイルがあるだけループ）

        // 対象となるレコードを取得（以下、ファイル内ループ）
        // 固定長を分割

        // 分割した固定長の中から対象の要素を取得

        // 変換処理

        // 固定長レコード再構築

        // 元のレコード置き換え（ファイル内ループここまで）

        // ファイル保存
    }

    private String dateConv(String DateString) {
        return null;
    }

    private String getDateString() {
        // TODO
        return null; // FIXME
    }

    private void writeDat() {
        // TODO
    }

    private String readDat() {
        // TODO
        return null; // FIXME
    }

    public List<String> fixedStringParser(String fixedString, List<Integer> separateNum) {
        // 固定長文字列長と分割予定の文字列長と等しいか、大きいことを確認する（大きい場合は残りをそのまま返す）
        int totalNum = 0;
        for (Integer integer : separateNum) {
            totalNum = totalNum + integer;
        }
        if (fixedString.length() < 1 || fixedString.length() < totalNum) {
            return null; // FIXME return exception
        }
        // 文字列を分割してリストに詰める
        List<String> separateStrings = new ArrayList<String>();
        int next = 0;
        for (Integer sep : separateNum) {
            separateStrings.add(fixedString.substring(next, next + sep));
            next = next + sep;
        }
        return separateStrings;
    }

}
