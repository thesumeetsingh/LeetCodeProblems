select distinct v.author_id as id from views v, views w where v.author_id=w.viewer_id order by id;
