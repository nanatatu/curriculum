/* ■ [回答]と記載のある箇所へ、1〜8の各課題内容に沿ったSQL文を記述しなさい。 */
 
-- 1. 店舗テーブルから店舗名を抽出しなさい。また、列名の表示は別名で'店舗名'とすること。
-- [ SELECT store_name AS 店舗名 FROM store_table; ]
 
 
-- 2. 店舗情報を店舗名のABC順に抽出しなさい。
-- [ SELECT * FROM store_table ORDER BY store_name ASC; ]
 
 
-- 3. 在庫テーブルに店舗テーブル、商品テーブルを「内部結合」し、店舗名・商品名・在庫数を全て取得しなさい。
-- [ SELECT store_name, goods_name, quantity
--   FROM (store_table AS store
--   JOIN stock_table AS stock ON (stock.store_code = store.store_code))
--   JOIN goods_table AS goods ON (goods.goods_code = stock.goods_code) ;]
 
 
-- 4. 商品テーブルから全商品の単価の平均値を抽出しなさい。
-- [ SELECT AVG(price) FROM goods_table; ]
 
 
-- 5. 店舗コード='EA01'の在庫数の平均値より大きい在庫数を持つ店舗コードを抽出しなさい。
-- [ SELECT store_table.store_code FROM store_table
--   JOIN stock_table  ON store_table.store_code = stock_table.store_code
--   WHERE quantity > (SELECT AVG(quantity) FROM stock_table WHERE store_code = 'EA01'); ]
 
 
-- 6. 商品テーブルに「商品コード='M001'、商品名='マフラー'、単価=4500円、更新日付=本日日付」のデータを追加しなさい。※実行後のSELECT結果も貼付すること。
-- [ INSERT INTO goods_table
--   	(goods_code, goods_name, price, update_day)
--   VALUES
--   	('M0001', 'マフラー', 4500, '2021-02-06');]

--[ SELECT * FROM goods_table; ]
 
 
-- 7. 在庫テーブルの商品コード='S987'、かつ、店舗コード='EA01'に対して、「在庫数=10、更新日付=本日日付」で更新しなさい。※実行後のSELECT結果も貼付すること。
-- [ UPDATE stock_table
--   SET
--   	quantity = 10,
--   	update_day = '2021-02-07'
--   WHERE
--   	goods_code = 'S987' AND 
--   	store_code = 'EA01'; ]

--[ SELECT * FROM stock_table; ]
 
 
-- 8. 7で更新した商品を削除しなさい。※実行後のSELECT結果も貼付すること。
-- [ DELETE FROM stock_table
--   WHERE 
--		goods_code = 'S987' AND
--		update_day = '2021-02-07'; ]

--[ SELECT * FROM stock_table; ]