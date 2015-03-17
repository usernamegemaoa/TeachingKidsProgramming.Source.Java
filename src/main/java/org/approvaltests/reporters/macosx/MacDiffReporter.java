package org.approvaltests.reporters.macosx;

import org.teachingkidsprogramming.approvals.lite.reporters.FirstWorkingReporter;

public class MacDiffReporter extends FirstWorkingReporter
{
  public static final MacDiffReporter INSTANCE = new MacDiffReporter();
  public MacDiffReporter()
  {
    super(DiffMergeReporter.INSTANCE, KaleidoscopeDiffReporter.INSTANCE,  P4MergeReporter.INSTANCE, TkDiffReporter.INSTANCE);
  }
}
