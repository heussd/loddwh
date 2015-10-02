select level0.id, level0.subject, level1.id, level1.subject, level2.id
from subjects level0
inner join subjects level1 on (level1.subject = level0.subject and level1.id <> level0.id)
inner join subjects level2 on (level2.subject = level1.subject and level2.id <> level1.id and level1.id <> level0.id)
