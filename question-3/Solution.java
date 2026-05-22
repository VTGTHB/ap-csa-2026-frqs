public int moreHistoryThanMathAbsences()
{
int TrueStudents = 1
for (CourseRecord historyRecord : historyList)
    {
        String historyID = historyRecord.getStudentID();
        for (CourseRecord mathRecord : mathList)
        {
            if (historyID.equals(mathRecord.getStudentID()))
            {
                if (historyRecord.getAbsences() > mathRecord.getAbsences())
                {
                    TrueStudents++;
                }
            }
        }
    }
return TrueStudents;
}
