.class final Lcom/tencent/mm/ui/base/MMViewPager$i;
.super Lcom/tencent/mm/ui/base/MMViewPager$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/mm/ui/base/MMViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "i"
.end annotation


# instance fields
.field final synthetic lhv:Lcom/tencent/mm/ui/base/MMViewPager;

.field lhx:[F


# direct methods
.method public constructor <init>(Lcom/tencent/mm/ui/base/MMViewPager;)V
    .locals 1

    .prologue
    .line 195
    iput-object p1, p0, Lcom/tencent/mm/ui/base/MMViewPager$i;->lhv:Lcom/tencent/mm/ui/base/MMViewPager;

    .line 196
    invoke-direct {p0, p1}, Lcom/tencent/mm/ui/base/MMViewPager$a;-><init>(Lcom/tencent/mm/ui/base/MMViewPager;)V

    .line 193
    const/16 v0, 0x9

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/tencent/mm/ui/base/MMViewPager$i;->lhx:[F

    .line 198
    return-void
.end method


# virtual methods
.method public final play()V
    .locals 2

    .prologue
    .line 203
    iget-object v0, p0, Lcom/tencent/mm/ui/base/MMViewPager$i;->lhv:Lcom/tencent/mm/ui/base/MMViewPager;

    invoke-static {v0}, Lcom/tencent/mm/ui/base/MMViewPager;->c(Lcom/tencent/mm/ui/base/MMViewPager;)Lcom/tencent/mm/sdk/platformtools/ac;

    move-result-object v0

    new-instance v1, Lcom/tencent/mm/ui/base/MMViewPager$i$1;

    invoke-direct {v1, p0}, Lcom/tencent/mm/ui/base/MMViewPager$i$1;-><init>(Lcom/tencent/mm/ui/base/MMViewPager$i;)V

    invoke-virtual {v0, v1}, Lcom/tencent/mm/sdk/platformtools/ac;->post(Ljava/lang/Runnable;)Z

    .line 242
    return-void
.end method