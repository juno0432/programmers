-- 코드를 입력하세요
SELECT CONCAT("/home/grep/src/",BOARD_ID,"/",FILE_ID,FILE_NAME,FILE_EXT)
from(
    select views, ugb.BOARD_ID, ugf.FILE_ID, ugf.FILE_NAME, ugf.FILE_EXT
    from used_goods_board ugb inner join used_goods_file ugf on ugb.board_id = ugf.board_id
    WHERE ugb.VIEWS = (
        SELECT MAX(VIEWS)
        FROM used_goods_board
    )
    ORDER BY UGF.FILE_ID DESC
    ) A
    
    
